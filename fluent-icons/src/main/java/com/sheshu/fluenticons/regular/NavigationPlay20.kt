package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NavigationPlay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NavigationPlay20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 6f, 18f, 5.776f, 18f, 5.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-15f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2.224f, 10f, 2f, 10.224f, 2f, 10.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(8.757f)
            curveToRelative(0.313f, -0.38f, 0.677f, -0.716f, 1.08f, -1f)
            horizontalLineTo(2.5f)
            close()
            moveToRelative(7.707f, 6f)
            curveToRelative(-0.091f, -0.322f, -0.154f, -0.657f, -0.185f, -1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 15f, 2f, 15.224f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 16f, 2.5f, 16f)
            horizontalLineToRelative(7.707f)
            close()
            moveTo(20f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(11f, 16.985f, 11f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.287f, -0.437f)
            lineToRelative(-2.97f, -1.65f)
            curveTo(14.41f, 12.227f, 14f, 12.469f, 14f, 12.85f)
            verticalLineToRelative(3.3f)
            curveToRelative(0f, 0.382f, 0.41f, 0.623f, 0.743f, 0.437f)
            lineToRelative(2.97f, -1.65f)
            curveToRelative(0.343f, -0.19f, 0.343f, -0.684f, 0f, -0.874f)
            close()
        }
    }.build()
}
