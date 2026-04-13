package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareScreenPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineToRelative(6.3f)
            curveToRelative(0.075f, -0.37f, 0.231f, -0.71f, 0.45f, -1f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineToRelative(-6.5f)
            curveTo(3f, 5.784f, 3.784f, 5f, 4.75f, 5f)
            horizontalLineToRelative(10.5f)
            curveTo(16.216f, 5f, 17f, 5.784f, 17f, 6.75f)
            verticalLineToRelative(2.651f)
            curveToRelative(0.401f, 0.232f, 0.744f, 0.555f, 1f, 0.94f)
            verticalLineTo(6.75f)
            curveTo(18f, 5.231f, 16.769f, 4f, 15.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveToRelative(12.75f, 8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(12f, 17.75f, 12f, 16.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
