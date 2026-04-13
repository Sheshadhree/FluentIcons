package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BreakoutRoom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BreakoutRoom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5.036f)
            curveTo(13.512f, 20.15f, 14f, 19.007f, 14f, 17.75f)
            verticalLineToRelative(-3f)
            curveTo(14f, 12.127f, 11.873f, 10f, 9.25f, 10f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.257f, 0f, -2.4f, 0.488f, -3.25f, 1.286f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(0f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(3f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-3f)
            curveTo(4.455f, 11.5f, 3f, 12.955f, 3f, 14.75f)
            close()
        }
    }.build()
}
