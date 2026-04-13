package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignStretchHorizontal16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignStretchHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 1.5f)
            curveTo(3f, 1.224f, 2.776f, 1f, 2.5f, 1f)
            reflectiveCurveTo(2f, 1.224f, 2f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(2f, 14.776f, 2.224f, 15f, 2.5f, 15f)
            reflectiveCurveTo(3f, 14.776f, 3f, 14.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(11f, 0f)
            curveTo(14f, 1.224f, 13.776f, 1f, 13.5f, 1f)
            reflectiveCurveTo(13f, 1.224f, 13f, 1.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(-10f, 3f)
            curveTo(4f, 3.672f, 4.672f, 3f, 5.5f, 3f)
            horizontalLineToRelative(5f)
            curveTo(11.328f, 3f, 12f, 3.672f, 12f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(12f, 6.328f, 11.328f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 7f, 4f, 6.328f, 4f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(0f, 6f)
            curveTo(4f, 9.672f, 4.672f, 9f, 5.5f, 9f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 13f, 4f, 12.328f, 4f, 11.5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}
