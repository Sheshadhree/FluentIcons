package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherPartlyCloudyNight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherPartlyCloudyNight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7f)
            curveToRelative(2.465f, 0f, 3.863f, 1.574f, 4.066f, 3.474f)
            horizontalLineToRelative(0.062f)
            curveToRelative(1.586f, 0f, 2.872f, 1.237f, 2.872f, 2.763f)
            curveTo(18f, 14.763f, 16.714f, 16f, 15.128f, 16f)
            horizontalLineTo(6.872f)
            curveTo(5.286f, 16f, 4f, 14.763f, 4f, 13.237f)
            curveToRelative(0f, -1.47f, 1.192f, -2.671f, 2.697f, -2.758f)
            lineToRelative(0.237f, -0.005f)
            curveTo(7.138f, 8.561f, 8.535f, 7f, 11f, 7f)
            close()
            moveTo(5.843f, 3f)
            curveToRelative(0.666f, 0.037f, 1.312f, 0.228f, 1.895f, 0.565f)
            curveTo(8.752f, 4.151f, 9.434f, 5.09f, 9.717f, 6.138f)
            curveToRelative(-1.724f, 0.38f, -2.963f, 1.54f, -3.469f, 3.141f)
            lineTo(6.184f, 9.5f)
            lineTo(6.138f, 9.687f)
            lineToRelative(-0.165f, 0.03f)
            curveToRelative(-0.89f, 0.184f, -1.664f, 0.677f, -2.2f, 1.362f)
            curveToRelative(-0.096f, -0.044f, -0.192f, -0.095f, -0.287f, -0.15f)
            curveToRelative(-0.55f, -0.317f, -1.018f, -0.75f, -1.375f, -1.268f)
            curveToRelative(-0.234f, -0.34f, -0.083f, -0.81f, 0.306f, -0.948f)
            curveToRelative(1.376f, -0.492f, 2.117f, -1.046f, 2.54f, -1.855f)
            curveTo(5.42f, 5.973f, 5.506f, 5.037f, 5.2f, 3.777f)
            curveTo(5.1f, 3.367f, 5.423f, 2.977f, 5.844f, 3f)
            close()
        }
    }.build()
}
