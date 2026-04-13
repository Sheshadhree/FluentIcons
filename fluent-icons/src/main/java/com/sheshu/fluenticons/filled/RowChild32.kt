package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RowChild32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RowChild32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(19.5f)
            curveTo(27.545f, 3f, 29f, 4.455f, 29f, 6.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(9f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineTo(16f)
            verticalLineToRelative(-1.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.5f)
            curveTo(17.455f, 29f, 16f, 27.545f, 16f, 25.75f)
            verticalLineTo(25f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.015f, 25f, 7f, 22.985f, 7f, 20.5f)
            verticalLineTo(14f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 14f, 3f, 12.545f, 3f, 10.75f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
