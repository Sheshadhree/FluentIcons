package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PauseOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PauseOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.707f)
            verticalLineTo(16.5f)
            curveTo(3f, 17.328f, 3.672f, 18f, 4.5f, 18f)
            horizontalLineToRelative(2f)
            curveTo(7.328f, 18f, 8f, 17.328f, 8f, 16.5f)
            verticalLineTo(8.707f)
            lineToRelative(4f, 4f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.489f, 0f, 0.923f, -0.234f, 1.197f, -0.596f)
            lineToRelative(0.45f, 0.45f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(3f, 3.707f)
            close()
            moveToRelative(9f, 6.172f)
            lineToRelative(5f, 5f)
            verticalLineTo(3.5f)
            curveTo(17f, 2.672f, 16.328f, 2f, 15.5f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(12.672f, 2f, 12f, 2.672f, 12f, 3.5f)
            verticalLineToRelative(6.379f)
            close()
            moveToRelative(-7.84f, -7.84f)
            lineTo(8f, 5.879f)
            verticalLineTo(3.5f)
            curveTo(8f, 2.672f, 7.328f, 2f, 6.5f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(4.383f, 2f, 4.27f, 2.013f, 4.16f, 2.039f)
            close()
        }
    }.build()
}
