package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowFour24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowFour24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 8f)
            verticalLineToRelative(3.25f)
            horizontalLineToRelative(18f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            close()
            moveToRelative(18f, -1.5f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(18f)
            close()
            moveTo(3f, 16f)
            verticalLineToRelative(-3.25f)
            horizontalLineToRelative(18f)
            verticalLineTo(16f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, 1.5f)
            verticalLineToRelative(0.25f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(17.5f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
