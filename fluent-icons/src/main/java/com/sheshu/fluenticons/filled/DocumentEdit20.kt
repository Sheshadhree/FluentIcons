package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentEdit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentEdit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            verticalLineTo(2f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(4f, 17.328f, 4.672f, 18f, 5.5f, 18f)
            horizontalLineToRelative(2.721f)
            curveToRelative(-0.21f, -0.39f, -0.285f, -0.86f, -0.164f, -1.347f)
            lineToRelative(0.375f, -1.498f)
            curveToRelative(0.14f, -0.562f, 0.43f, -1.075f, 0.84f, -1.485f)
            lineToRelative(4.83f, -4.83f)
            curveTo(14.63f, 8.315f, 15.31f, 8.035f, 16f, 8.004f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4.5f)
            curveTo(10.672f, 8f, 10f, 7.328f, 10f, 6.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(2.25f)
            lineTo(15.75f, 7f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 7f, 11f, 6.776f, 11f, 6.5f)
            close()
            moveToRelative(6.454f, 3.048f)
            curveToRelative(-0.73f, -0.73f, -1.915f, -0.73f, -2.645f, 0f)
            lineToRelative(-4.83f, 4.83f)
            curveToRelative(-0.28f, 0.28f, -0.48f, 0.634f, -0.577f, 1.02f)
            lineToRelative(-0.375f, 1.498f)
            curveToRelative(-0.162f, 0.651f, 0.428f, 1.241f, 1.079f, 1.078f)
            lineToRelative(1.498f, -0.374f)
            curveToRelative(0.386f, -0.097f, 0.739f, -0.296f, 1.02f, -0.578f)
            lineToRelative(4.83f, -4.83f)
            curveToRelative(0.73f, -0.73f, 0.73f, -1.914f, 0f, -2.644f)
            close()
        }
    }.build()
}
