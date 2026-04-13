package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NavigationPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NavigationPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 4.224f, 2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 4f, 18f, 4.224f, 18f, 4.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveTo(17.776f, 10f, 17.5f, 10f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveTo(14.264f, 15f)
            curveToRelative(-0.258f, -0.289f, -0.462f, -0.627f, -0.593f, -1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 14f, 2f, 14.224f, 2f, 14.5f)
            reflectiveCurveTo(2.224f, 15f, 2.5f, 15f)
            horizontalLineToRelative(11.764f)
            close()
            moveToRelative(4.236f, -2f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(13f, 18.75f, 13f, 17.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
