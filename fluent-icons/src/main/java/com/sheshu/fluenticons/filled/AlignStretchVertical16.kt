package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignStretchVertical16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignStretchVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 13f)
            curveTo(1.224f, 13f, 1f, 13.224f, 1f, 13.5f)
            reflectiveCurveTo(1.224f, 14f, 1.5f, 14f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 13f, 14.5f, 13f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, -11f)
            curveTo(1.224f, 2f, 1f, 2.224f, 1f, 2.5f)
            reflectiveCurveTo(1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 3f, 15f, 2.776f, 15f, 2.5f)
            reflectiveCurveTo(14.776f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(3f, 10f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(1f)
            curveTo(6.328f, 4f, 7f, 4.672f, 7f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(7f, 11.328f, 6.328f, 12f, 5.5f, 12f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(9f, 10.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(13f, 4.672f, 12.328f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-1f)
            curveTo(9.672f, 4f, 9f, 4.672f, 9f, 5.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
