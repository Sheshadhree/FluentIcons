package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.958f, 2.104f)
            curveToRelative(1.213f, -0.467f, 2.405f, 0.725f, 1.938f, 1.938f)
            lineTo(15.36f, 21.038f)
            curveToRelative(-0.522f, 1.36f, -2.48f, 1.252f, -2.85f, -0.156f)
            lineToRelative(-1.845f, -7.011f)
            curveToRelative(-0.07f, -0.262f, -0.273f, -0.466f, -0.535f, -0.535f)
            lineToRelative(-7.01f, -1.845f)
            curveToRelative(-1.409f, -0.37f, -1.516f, -2.327f, -0.157f, -2.85f)
            lineToRelative(16.996f, -6.537f)
            close()
            moveToRelative(0.538f, 1.4f)
            lineTo(3.5f, 10.04f)
            lineToRelative(7.011f, 1.845f)
            curveToRelative(0.784f, 0.206f, 1.397f, 0.819f, 1.603f, 1.603f)
            lineToRelative(1.845f, 7.01f)
            lineToRelative(6.537f, -16.995f)
            close()
        }
    }.build()
}
