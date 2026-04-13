package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Comment32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Comment32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3f)
            curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
            verticalLineToRelative(12f)
            curveTo(2f, 21.985f, 4.015f, 24f, 6.5f, 24f)
            horizontalLineTo(8f)
            verticalLineToRelative(4.081f)
            curveToRelative(0f, 1.706f, 2f, 2.629f, 3.298f, 1.522f)
            lineTo(17.868f, 24f)
            horizontalLineTo(25.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-12f)
            curveTo(30f, 5.015f, 27.985f, 3f, 25.5f, 3f)
            horizontalLineToRelative(-19f)
            close()
        }
    }.build()
}
