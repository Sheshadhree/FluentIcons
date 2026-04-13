package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pause32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 3f)
            curveTo(5.455f, 3f, 4f, 4.455f, 4f, 6.25f)
            verticalLineToRelative(18.5f)
            curveTo(4f, 26.545f, 5.455f, 28f, 7.25f, 28f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(14f, 4.455f, 12.545f, 3f, 10.75f, 3f)
            horizontalLineToRelative(-3.5f)
            close()
            moveToRelative(14f, 0f)
            curveTo(19.455f, 3f, 18f, 4.455f, 18f, 6.25f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(28f, 4.455f, 26.545f, 3f, 24.75f, 3f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
