package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataTrending16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataTrending16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 2.776f, 2f, 2.5f, 2f)
            reflectiveCurveTo(2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 13f, 13.5f, 13f)
            horizontalLineToRelative(-9f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(7f, 2f)
            curveTo(10f, 4.776f, 10.224f, 5f, 10.5f, 5f)
            horizontalLineToRelative(1.793f)
            lineTo(9f, 8.293f)
            lineTo(7.354f, 6.647f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(7f, 7.707f)
            lineToRelative(1.646f, 1.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineTo(13f, 5.707f)
            verticalLineToRelative(1.87f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.5f)
            curveTo(14f, 4.224f, 13.776f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-3f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            close()
        }
    }.build()
}
