package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationAdd20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationAdd20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.95f, 4.051f)
            curveToRelative(2.733f, 2.735f, 2.733f, 7.17f, 0f, 9.904f)
            lineToRelative(-1.128f, 1.114f)
            lineToRelative(-2.436f, 2.37f)
            curveToRelative(-0.73f, 0.706f, -1.864f, 0.746f, -2.64f, 0.118f)
            lineToRelative(-0.132f, -0.118f)
            lineToRelative(-2.043f, -1.985f)
            lineToRelative(-1.52f, -1.499f)
            curveToRelative(-2.734f, -2.735f, -2.734f, -7.169f, 0f, -9.904f)
            curveToRelative(2.733f, -2.735f, 7.165f, -2.735f, 9.899f, 0f)
            close()
            moveTo(10f, 5f)
            curveTo(9.724f, 5f, 9.5f, 5.224f, 9.5f, 5.5f)
            verticalLineTo(8f)
            horizontalLineTo(7f)
            curveTo(6.724f, 8f, 6.5f, 8.224f, 6.5f, 8.5f)
            reflectiveCurveTo(6.724f, 9f, 7f, 9f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(9f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 8f, 13f, 8f)
            horizontalLineToRelative(-2.5f)
            verticalLineTo(5.5f)
            curveTo(10.5f, 5.224f, 10.276f, 5f, 10f, 5f)
            close()
        }
    }.build()
}
