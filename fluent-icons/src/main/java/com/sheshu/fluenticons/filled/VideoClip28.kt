package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClip28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 4f)
            curveTo(3.679f, 4f, 2f, 5.679f, 2f, 7.75f)
            verticalLineToRelative(12.5f)
            curveTo(2f, 22.321f, 3.679f, 24f, 5.75f, 24f)
            horizontalLineToRelative(16.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(7.75f)
            curveTo(26f, 5.679f, 24.321f, 4f, 22.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveTo(10f, 10.251f)
            curveToRelative(0f, -0.755f, 0.806f, -1.238f, 1.472f, -0.881f)
            lineToRelative(7f, 3.75f)
            curveToRelative(0.703f, 0.377f, 0.703f, 1.386f, 0f, 1.763f)
            lineToRelative(-7f, 3.75f)
            curveTo(10.806f, 18.988f, 10f, 18.505f, 10f, 17.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
