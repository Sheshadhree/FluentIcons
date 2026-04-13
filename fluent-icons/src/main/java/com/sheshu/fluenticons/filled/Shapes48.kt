package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shapes48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.25f, 15.5f)
            horizontalLineToRelative(7.603f)
            curveTo(29.887f, 8.993f, 24.276f, 4f, 17.5f, 4f)
            curveTo(10.044f, 4f, 4f, 10.044f, 4f, 17.5f)
            curveToRelative(0f, 6.776f, 4.993f, 12.387f, 11.5f, 13.353f)
            verticalLineTo(23.25f)
            curveToRelative(0f, -4.28f, 3.47f, -7.75f, 7.75f, -7.75f)
            close()
            moveToRelative(0f, 2.5f)
            curveToRelative(-2.9f, 0f, -5.25f, 2.35f, -5.25f, 5.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineToRelative(-15.5f)
            curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
            horizontalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
