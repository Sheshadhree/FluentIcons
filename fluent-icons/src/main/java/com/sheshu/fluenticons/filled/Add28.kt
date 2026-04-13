package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Add28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Add28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 13f)
            horizontalLineToRelative(-9f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.553f, -0.447f, -1f, -1f, -1f)
            curveToRelative(-0.553f, 0f, -1f, 0.447f, -1f, 1f)
            verticalLineToRelative(9f)
            horizontalLineTo(4f)
            curveToRelative(-0.553f, 0f, -1f, 0.447f, -1f, 1f)
            curveToRelative(0f, 0.553f, 0.447f, 1f, 1f, 1f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.553f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.553f, 0f, 1f, -0.447f, 1f, -1f)
            verticalLineToRelative(-9f)
            horizontalLineToRelative(9f)
            curveToRelative(0.553f, 0f, 1f, -0.447f, 1f, -1f)
            curveToRelative(0f, -0.553f, -0.447f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
