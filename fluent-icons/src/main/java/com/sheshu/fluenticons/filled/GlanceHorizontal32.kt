package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.GlanceHorizontal32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlanceHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 13.545f, 4.455f, 15f, 6.25f, 15f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-5.5f)
            curveTo(18f, 4.455f, 16.545f, 3f, 14.75f, 3f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(11f, 15f)
            curveTo(15.455f, 18f, 14f, 19.455f, 14f, 21.25f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(7f, -15f)
            curveTo(22.455f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-5.5f)
            curveTo(29f, 4.455f, 27.545f, 3f, 25.75f, 3f)
            horizontalLineToRelative(-1.5f)
            close()
            moveToRelative(-18f, 15f)
            curveTo(4.455f, 18f, 3f, 19.455f, 3f, 21.25f)
            verticalLineToRelative(4.5f)
            curveTo(3f, 27.545f, 4.455f, 29f, 6.25f, 29f)
            horizontalLineToRelative(1.5f)
            curveTo(9.545f, 29f, 11f, 27.545f, 11f, 25.75f)
            verticalLineToRelative(-4.5f)
            curveTo(11f, 19.455f, 9.545f, 18f, 7.75f, 18f)
            horizontalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
