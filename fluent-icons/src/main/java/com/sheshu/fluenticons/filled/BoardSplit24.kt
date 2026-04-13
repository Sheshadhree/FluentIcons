package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardSplit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardSplit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(11f)
            horizontalLineToRelative(11f)
            verticalLineTo(3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(3f, 17.75f)
            verticalLineTo(12.5f)
            horizontalLineToRelative(11f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            close()
            moveTo(15.5f, 16f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(16f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(5.5f, -1.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 8f)
            horizontalLineToRelative(-5.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(2.25f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
