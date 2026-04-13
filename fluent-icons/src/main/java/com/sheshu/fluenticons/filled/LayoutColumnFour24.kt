package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutColumnFour24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutColumnFour24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 21f)
            horizontalLineToRelative(3.25f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(18f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(6.5f)
            verticalLineTo(3f)
            close()
            moveTo(16f, 21f)
            horizontalLineToRelative(-3.25f)
            verticalLineTo(3f)
            horizontalLineTo(16f)
            verticalLineToRelative(18f)
            close()
            moveToRelative(1.5f, 0f)
            horizontalLineToRelative(0.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(17.5f)
            verticalLineToRelative(18f)
            close()
        }
    }.build()
}
