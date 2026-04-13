package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.896f, 4.042f)
            curveToRelative(0.467f, -1.213f, -0.725f, -2.405f, -1.938f, -1.938f)
            lineTo(2.962f, 8.64f)
            curveToRelative(-1.36f, 0.522f, -1.252f, 2.48f, 0.156f, 2.85f)
            lineToRelative(7.011f, 1.845f)
            curveToRelative(0.262f, 0.07f, 0.466f, 0.273f, 0.535f, 0.535f)
            lineToRelative(1.845f, 7.01f)
            curveToRelative(0.37f, 1.409f, 2.328f, 1.516f, 2.85f, 0.157f)
            lineToRelative(6.537f, -16.996f)
            close()
        }
    }.build()
}
