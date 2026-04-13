package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ScreenSearch24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScreenSearch24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(13.5f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.275f)
            lineToRelative(-1.5f, -1.5f)
            horizontalLineToRelative(7.775f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
            verticalLineToRelative(3.125f)
            curveToRelative(-0.548f, 0.214f, -1.054f, 0.514f, -1.5f, 0.882f)
            verticalLineTo(7.25f)
            close()
            moveTo(5.5f, 20f)
            curveToRelative(0.972f, 0f, 1.872f, -0.308f, 2.607f, -0.832f)
            lineToRelative(2.613f, 2.612f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.612f, -2.613f)
            curveTo(9.692f, 17.372f, 10f, 16.472f, 10f, 15.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(1f, 13.015f, 1f, 15.5f)
            reflectiveCurveTo(3.015f, 20f, 5.5f, 20f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            close()
        }
    }.build()
}
