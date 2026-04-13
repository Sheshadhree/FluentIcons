package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Power20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Power20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 2.5f)
            curveTo(10.5f, 2.224f, 10.276f, 2f, 10f, 2f)
            reflectiveCurveTo(9.5f, 2.224f, 9.5f, 2.5f)
            verticalLineToRelative(6f)
            curveTo(9.5f, 8.776f, 9.724f, 9f, 10f, 9f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(13.743f, 4f)
            curveToRelative(-0.24f, -0.137f, -0.545f, -0.055f, -0.683f, 0.185f)
            curveToRelative(-0.137f, 0.239f, -0.055f, 0.545f, 0.184f, 0.682f)
            curveToRelative(1.24f, 0.715f, 2.21f, 1.818f, 2.759f, 3.14f)
            curveToRelative(0.549f, 1.322f, 0.646f, 2.788f, 0.277f, 4.17f)
            curveToRelative(-0.37f, 1.383f, -1.185f, 2.605f, -2.32f, 3.477f)
            curveTo(12.825f, 16.526f, 11.435f, 17f, 10.003f, 17f)
            curveToRelative(-1.43f, 0f, -2.822f, -0.47f, -3.958f, -1.342f)
            curveToRelative(-1.136f, -0.87f, -1.952f, -2.092f, -2.323f, -3.474f)
            curveToRelative(-0.37f, -1.382f, -0.275f, -2.848f, 0.272f, -4.17f)
            curveTo(4.543f, 6.69f, 5.511f, 5.585f, 6.75f, 4.87f)
            curveToRelative(0.24f, -0.138f, 0.321f, -0.444f, 0.183f, -0.683f)
            curveToRelative(-0.138f, -0.24f, -0.444f, -0.321f, -0.683f, -0.183f)
            curveToRelative(-1.43f, 0.825f, -2.548f, 2.1f, -3.18f, 3.626f)
            curveToRelative(-0.631f, 1.525f, -0.742f, 3.217f, -0.314f, 4.812f)
            curveToRelative(0.428f, 1.595f, 1.37f, 3.004f, 2.68f, 4.009f)
            curveTo(6.748f, 17.457f, 8.354f, 18f, 10.005f, 18f)
            curveToRelative(1.651f, 0f, 3.256f, -0.547f, 4.566f, -1.553f)
            curveToRelative(1.309f, -1.006f, 2.25f, -2.416f, 2.676f, -4.011f)
            curveToRelative(0.426f, -1.596f, 0.314f, -3.287f, -0.32f, -4.813f)
            curveToRelative(-0.633f, -1.525f, -1.752f, -2.798f, -3.183f, -3.622f)
            close()
        }
    }.build()
}
