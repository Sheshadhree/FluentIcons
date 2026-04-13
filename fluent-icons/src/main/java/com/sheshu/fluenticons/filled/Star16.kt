package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Star16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Star16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.194f, 2.101f)
            curveToRelative(0.33f, -0.669f, 1.284f, -0.669f, 1.614f, 0f)
            lineToRelative(1.521f, 3.082f)
            lineToRelative(3.401f, 0.495f)
            curveToRelative(0.739f, 0.107f, 1.033f, 1.014f, 0.5f, 1.535f)
            lineToRelative(-2.462f, 2.399f)
            lineToRelative(0.581f, 3.387f)
            curveToRelative(0.126f, 0.736f, -0.646f, 1.296f, -1.306f, 0.949f)
            lineToRelative(-3.042f, -1.6f)
            lineToRelative(-3.042f, 1.6f)
            curveToRelative(-0.66f, 0.347f, -1.432f, -0.213f, -1.306f, -0.949f)
            lineToRelative(0.58f, -3.387f)
            lineToRelative(-2.46f, -2.4f)
            curveToRelative(-0.534f, -0.52f, -0.24f, -1.427f, 0.499f, -1.534f)
            lineToRelative(3.4f, -0.495f)
            lineToRelative(1.522f, -3.082f)
            close()
        }
    }.build()
}
