package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutColumnTwoSplitLeft24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutColumnTwoSplitLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 21f)
            horizontalLineToRelative(-5f)
            verticalLineTo(3f)
            horizontalLineToRelative(5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            close()
            moveTo(6.25f, 3f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(8.25f)
            horizontalLineTo(3f)
            verticalLineToRelative(-5f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            close()
            moveTo(3f, 12.75f)
            verticalLineToRelative(5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-8.25f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
