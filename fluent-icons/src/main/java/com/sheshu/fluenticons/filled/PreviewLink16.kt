package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PreviewLink16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PreviewLink16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8f)
            verticalLineTo(5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(6f, 4f)
            verticalLineToRelative(2.005f)
            horizontalLineToRelative(2f)
            verticalLineTo(9f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(1f, 4.75f)
            curveTo(1f, 3.231f, 2.231f, 2f, 3.75f, 2f)
            horizontalLineToRelative(8.5f)
            curveTo(13.769f, 2f, 15f, 3.231f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(2.231f, 14f, 1f, 12.769f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(3f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(3f, 6.776f, 3.224f, 7f, 3.5f, 7f)
            horizontalLineToRelative(9f)
            curveTo(12.778f, 7f, 13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-2f)
            curveTo(13f, 4.224f, 12.778f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            close()
            moveToRelative(6f, 4f)
            verticalLineToRelative(3.005f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(8.5f)
            curveTo(13f, 8.224f, 12.776f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-3f)
            curveTo(9.224f, 8f, 9f, 8.224f, 9f, 8.5f)
            close()
            moveToRelative(-5.5f, 0f)
            curveTo(3.224f, 8.5f, 3f, 8.724f, 3f, 9f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveTo(7.776f, 9.5f, 8f, 9.276f, 8f, 9f)
            reflectiveCurveTo(7.776f, 8.5f, 7.5f, 8.5f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(3f, 11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveTo(7.776f, 11.5f, 8f, 11.276f, 8f, 11f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-4f)
            curveTo(3.224f, 10.5f, 3f, 10.724f, 3f, 11f)
            close()
        }
    }.build()
}
