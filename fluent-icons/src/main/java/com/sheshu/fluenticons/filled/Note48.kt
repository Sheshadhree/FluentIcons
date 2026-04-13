package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Note48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Note48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 6f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(23.5f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineTo(26f)
            verticalLineToRelative(-9.75f)
            curveToRelative(0f, -3.452f, 2.798f, -6.25f, 6.25f, -6.25f)
            horizontalLineTo(42f)
            verticalLineTo(12.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            close()
            moveToRelative(29.197f, 22.5f)
            horizontalLineTo(32.25f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(9.197f)
            curveToRelative(0.682f, -0.308f, 1.31f, -0.739f, 1.848f, -1.278f)
            lineToRelative(9.821f, -9.82f)
            curveToRelative(0.54f, -0.54f, 0.97f, -1.167f, 1.278f, -1.849f)
            close()
        }
    }.build()
}
