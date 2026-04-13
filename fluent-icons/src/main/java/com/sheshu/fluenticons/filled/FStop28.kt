package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FStop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FStop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.598f, 7.987f)
            curveToRelative(0.475f, -2.426f, 3.015f, -3.846f, 5.33f, -2.977f)
            lineToRelative(0.471f, 0.176f)
            curveToRelative(0.517f, 0.194f, 1.094f, -0.068f, 1.287f, -0.585f)
            curveToRelative(0.195f, -0.517f, -0.067f, -1.093f, -0.585f, -1.287f)
            lineToRelative(-0.47f, -0.177f)
            curveToRelative(-3.473f, -1.302f, -7.284f, 0.826f, -7.996f, 4.466f)
            lineTo(12.775f, 12f)
            horizontalLineTo(7.75f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.633f)
            lineToRelative(-0.98f, 5.013f)
            curveToRelative(-0.475f, 2.426f, -3.016f, 3.845f, -5.33f, 2.977f)
            lineTo(5.6f, 21.814f)
            curveToRelative(-0.517f, -0.194f, -1.093f, 0.068f, -1.287f, 0.585f)
            curveToRelative(-0.194f, 0.517f, 0.068f, 1.093f, 0.585f, 1.287f)
            lineToRelative(0.471f, 0.177f)
            curveToRelative(3.473f, 1.302f, 7.283f, -0.826f, 7.995f, -4.466f)
            lineTo(14.421f, 14f)
            horizontalLineToRelative(4.829f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4.437f)
            lineToRelative(0.785f, -4.013f)
            close()
        }
    }.build()
}
