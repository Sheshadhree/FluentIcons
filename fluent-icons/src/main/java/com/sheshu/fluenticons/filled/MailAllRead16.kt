package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailAllRead16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailAllRead16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.24f, 1.061f)
            curveToRelative(-0.15f, -0.081f, -0.33f, -0.081f, -0.48f, 0f)
            lineTo(1.7f, 3.821f)
            curveToRelative(-0.202f, 0.11f, -0.367f, 0.267f, -0.487f, 0.453f)
            lineTo(7f, 7.431f)
            lineToRelative(5.787f, -3.157f)
            curveToRelative(-0.12f, -0.186f, -0.285f, -0.343f, -0.487f, -0.452f)
            lineToRelative(-5.06f, -2.76f)
            close()
            moveTo(1f, 10f)
            verticalLineTo(5.297f)
            lineToRelative(5.76f, 3.142f)
            curveToRelative(0.15f, 0.081f, 0.33f, 0.081f, 0.48f, 0f)
            lineTo(13f, 5.297f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(2.268f, 3f)
            curveTo(3.613f, 13.598f, 4.26f, 14f, 5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(3.268f)
            close()
        }
    }.build()
}
