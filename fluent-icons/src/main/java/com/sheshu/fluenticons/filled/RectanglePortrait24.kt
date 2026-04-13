package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RectanglePortrait24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RectanglePortrait24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 18.75f)
            curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(20f, 3.455f, 18.545f, 2f, 16.75f, 2f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
            verticalLineToRelative(13.5f)
            close()
        }
    }.build()
}
