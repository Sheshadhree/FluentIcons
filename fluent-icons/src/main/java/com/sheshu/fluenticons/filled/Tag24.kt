package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.75f, 2f)
            curveTo(20.992f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineToRelative(5.462f)
            curveToRelative(0f, 0.862f, -0.343f, 1.688f, -0.952f, 2.298f)
            lineToRelative(-8.5f, 8.503f)
            curveToRelative(-1.27f, 1.267f, -3.326f, 1.268f, -4.597f, 0.001f)
            lineTo(3.489f, 16.06f)
            curveToRelative(-1.27f, -1.268f, -1.272f, -3.326f, -0.004f, -4.596f)
            lineToRelative(8.5f, -8.51f)
            curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
            horizontalLineToRelative(5.465f)
            close()
            moveTo(17f, 5.502f)
            curveToRelative(-0.829f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.build()
}
