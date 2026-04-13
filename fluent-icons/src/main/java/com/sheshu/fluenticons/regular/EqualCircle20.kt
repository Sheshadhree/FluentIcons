package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 9f)
            curveTo(13.776f, 9f, 14f, 8.776f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 11f, 6f, 11.224f, 6f, 11.5f)
            reflectiveCurveTo(6.224f, 12f, 6.5f, 12f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(4.5f, -2f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveToRelative(-8f, -7f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
        }
    }.build()
}
