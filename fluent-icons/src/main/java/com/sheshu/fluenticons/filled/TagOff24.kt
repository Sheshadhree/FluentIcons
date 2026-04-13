package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 17.06f)
            lineToRelative(4.72f, 4.72f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4.722f, 4.723f)
            lineToRelative(-3.456f, 3.46f)
            curveToRelative(-1.268f, 1.27f, -1.266f, 3.328f, 0.004f, 4.596f)
            lineToRelative(4.462f, 4.455f)
            curveToRelative(1.27f, 1.267f, 3.327f, 1.266f, 4.596f, -0.001f)
            lineTo(16f, 17.06f)
            close()
            moveToRelative(5.05f, -5.05f)
            lineTo(18.06f, 15f)
            lineTo(9.002f, 5.94f)
            lineToRelative(2.984f, -2.988f)
            curveTo(12.596f, 2.343f, 13.423f, 2f, 14.286f, 2f)
            horizontalLineToRelative(5.465f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineToRelative(5.462f)
            curveToRelative(0f, 0.862f, -0.343f, 1.688f, -0.952f, 2.298f)
            close()
            moveTo(17f, 5.502f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.build()
}
