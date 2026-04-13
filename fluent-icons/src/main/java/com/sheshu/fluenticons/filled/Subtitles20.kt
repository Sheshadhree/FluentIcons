package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Subtitles20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Subtitles20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 16f, 2f, 14.769f, 2f, 13.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(2f, 4.75f)
            curveTo(4f, 11.776f, 4.224f, 12f, 4.5f, 12f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 11f, 11.5f, 11f)
            horizontalLineToRelative(-7f)
            curveTo(4.224f, 11f, 4f, 11.224f, 4f, 11.5f)
            close()
            moveTo(4.5f, 13f)
            curveTo(4.224f, 13f, 4f, 13.224f, 4f, 13.5f)
            reflectiveCurveTo(4.224f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 14f, 8f, 13.776f, 8f, 13.5f)
            reflectiveCurveTo(7.776f, 13f, 7.5f, 13f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(8.5f, -1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 11f, 15.5f, 11f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
            moveTo(9.5f, 13f)
            curveTo(9.224f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 14f, 9.5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 13f, 15.5f, 13f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
