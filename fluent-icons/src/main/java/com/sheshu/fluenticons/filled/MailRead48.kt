package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.151f, 4.69f)
            curveToRelative(1.789f, -0.916f, 3.91f, -0.916f, 5.698f, 0f)
            lineToRelative(13.75f, 7.042f)
            curveToRelative(1.118f, 0.573f, 2.014f, 1.454f, 2.605f, 2.51f)
            lineTo(24.002f, 24.35f)
            lineTo(4.834f, 14.176f)
            curveToRelative(0.591f, -1.027f, 1.473f, -1.883f, 2.567f, -2.444f)
            lineToRelative(13.75f, -7.042f)
            close()
            moveTo(4.041f, 16.585f)
            curveTo(4.013f, 16.819f, 4f, 17.055f, 4f, 17.295f)
            verticalLineTo(33.75f)
            curveTo(4f, 37.202f, 6.798f, 40f, 10.25f, 40f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineTo(17.295f)
            curveToRelative(0f, -0.212f, -0.01f, -0.422f, -0.032f, -0.63f)
            lineTo(24.582f, 26.87f)
            curveToRelative(-0.366f, 0.192f, -0.803f, 0.191f, -1.168f, -0.002f)
            lineTo(4.04f, 16.585f)
            close()
        }
    }.build()
}
