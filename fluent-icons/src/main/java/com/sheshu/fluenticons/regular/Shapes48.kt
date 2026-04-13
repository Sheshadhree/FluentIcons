package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Shapes48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shapes48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 6.5f)
            curveToRelative(-6.075f, 0f, -11f, 4.925f, -11f, 11f)
            curveToRelative(0f, 5.392f, 3.88f, 9.878f, 9f, 10.819f)
            verticalLineToRelative(2.534f)
            curveTo(8.993f, 29.887f, 4f, 24.276f, 4f, 17.5f)
            curveTo(4f, 10.044f, 10.044f, 4f, 17.5f, 4f)
            curveToRelative(6.776f, 0f, 12.387f, 4.993f, 13.353f, 11.5f)
            horizontalLineToRelative(-2.534f)
            curveToRelative(-0.94f, -5.12f, -5.427f, -9f, -10.819f, -9f)
            close()
            moveTo(23.25f, 18f)
            curveToRelative(-2.9f, 0f, -5.25f, 2.35f, -5.25f, 5.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            verticalLineToRelative(-15.5f)
            curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
            horizontalLineToRelative(-15.5f)
            close()
            moveToRelative(-2.75f, 5.25f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-15.5f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
