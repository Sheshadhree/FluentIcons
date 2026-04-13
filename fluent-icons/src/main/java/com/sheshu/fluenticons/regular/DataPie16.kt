package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataPie16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataPie16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            curveTo(8.224f, 1f, 8f, 1.224f, 8f, 1.5f)
            verticalLineToRelative(6f)
            curveTo(8f, 7.776f, 8.224f, 8f, 8.5f, 8f)
            horizontalLineToRelative(6f)
            curveTo(14.776f, 8f, 15f, 7.776f, 15f, 7.5f)
            curveTo(15f, 3.91f, 12.09f, 1f, 8.5f, 1f)
            close()
            moveTo(9f, 7f)
            verticalLineTo(2.022f)
            curveTo(11.639f, 2.26f, 13.74f, 4.362f, 13.978f, 7f)
            horizontalLineTo(9f)
            close()
            moveTo(7f, 3.522f)
            curveToRelative(0f, -0.14f, -0.059f, -0.274f, -0.163f, -0.369f)
            curveTo(6.734f, 3.06f, 6.595f, 3.012f, 6.455f, 3.025f)
            curveTo(3.397f, 3.3f, 1f, 5.87f, 1f, 9f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            curveToRelative(3.13f, 0f, 5.7f, -2.396f, 5.976f, -5.455f)
            curveToRelative(0.012f, -0.14f, -0.035f, -0.279f, -0.13f, -0.382f)
            curveTo(12.753f, 9.059f, 12.619f, 9f, 12.479f, 9f)
            horizontalLineTo(7f)
            verticalLineTo(3.522f)
            close()
            moveTo(2f, 9f)
            curveToRelative(0f, -2.419f, 1.718f, -4.437f, 4f, -4.9f)
            verticalLineToRelative(5.4f)
            curveTo(6f, 9.776f, 6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(5.4f)
            curveToRelative(-0.463f, 2.282f, -2.481f, 4f, -4.9f, 4f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
        }
    }.build()
}
