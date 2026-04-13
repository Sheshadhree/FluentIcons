package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherFog20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherFog20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(13.5f, 16f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 16f, 6f, 15.776f, 6f, 15.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(6.5f, 15f)
            close()
            moveToRelative(-1.996f, -2f)
            horizontalLineToRelative(10.992f)
            curveTo(15.774f, 13f, 16f, 13.224f, 16f, 13.5f)
            curveToRelative(0f, 0.245f, -0.178f, 0.45f, -0.413f, 0.492f)
            lineTo(15.497f, 14f)
            horizontalLineTo(4.503f)
            curveTo(4.226f, 14f, 4f, 13.776f, 4f, 13.5f)
            curveToRelative(0f, -0.245f, 0.178f, -0.45f, 0.413f, -0.492f)
            lineTo(4.503f, 13f)
            close()
            moveTo(10f, 3f)
            curveToRelative(2.465f, 0f, 3.863f, 1.574f, 4.066f, 3.474f)
            horizontalLineToRelative(0.062f)
            curveTo(15.714f, 6.474f, 17f, 7.711f, 17f, 9.237f)
            curveTo(17f, 10.763f, 15.714f, 12f, 14.128f, 12f)
            horizontalLineTo(5.872f)
            curveTo(4.286f, 12f, 3f, 10.763f, 3f, 9.237f)
            curveToRelative(0f, -1.47f, 1.192f, -2.671f, 2.697f, -2.758f)
            lineToRelative(0.237f, -0.005f)
            curveTo(6.138f, 4.561f, 7.535f, 3f, 10f, 3f)
            close()
        }
    }.build()
}
