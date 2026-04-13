package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailUnread48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(41f, 16f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            curveToRelative(-2.071f, 0f, -3.848f, 1.26f, -4.607f, 3.054f)
            curveTo(36.14f, 9.652f, 36f, 10.31f, 36f, 11f)
            curveToRelative(0f, 2.226f, 1.455f, 4.113f, 3.467f, 4.76f)
            curveTo(39.95f, 15.917f, 40.465f, 16f, 41f, 16f)
            close()
            moveTo(10.25f, 9f)
            horizontalLineToRelative(23.002f)
            curveTo(33.087f, 9.64f, 33f, 10.31f, 33f, 11f)
            curveToRelative(0f, 2.676f, 1.313f, 5.044f, 3.331f, 6.497f)
            lineTo(24f, 24.325f)
            lineTo(5.018f, 13.814f)
            curveTo(5.24f, 11.118f, 7.498f, 9f, 10.25f, 9f)
            close()
            moveToRelative(14.352f, 18.347f)
            lineToRelative(15.394f, -8.41f)
            curveTo(40.325f, 18.98f, 40.66f, 19f, 41f, 19f)
            curveToRelative(0.69f, 0f, 1.36f, -0.087f, 2f, -0.252f)
            verticalLineTo(33.75f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-27.5f)
            curveTo(7.35f, 39f, 5f, 36.65f, 5f, 33.75f)
            verticalLineTo(17.296f)
            lineToRelative(18.398f, 10.051f)
            lineToRelative(0.127f, 0.061f)
            curveToRelative(0.348f, 0.143f, 0.744f, 0.123f, 1.077f, -0.06f)
            close()
        }
    }.build()
}
