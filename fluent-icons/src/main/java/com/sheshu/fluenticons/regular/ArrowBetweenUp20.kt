package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBetweenUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBetweenUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 18f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(3f, 18.276f, 3f, 18f)
            verticalLineToRelative(-0.5f)
            curveTo(3f, 16.672f, 3.672f, 16f, 4.5f, 16f)
            horizontalLineToRelative(10f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(18f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(15f, 18.276f, 15f, 18f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-10f)
            curveTo(4.224f, 17f, 4f, 17.224f, 4f, 17.5f)
            verticalLineTo(18f)
            close()
            moveToRelative(5.5f, -3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6.707f)
            lineToRelative(3.646f, 3.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(9f, 6.707f)
            verticalLineTo(14.5f)
            curveTo(9f, 14.776f, 9.224f, 15f, 9.5f, 15f)
            close()
            moveTo(3f, 2.5f)
            curveTo(3f, 3.328f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(10f)
            curveTo(15.328f, 4f, 16f, 3.328f, 16f, 2.5f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(15f, 1.724f, 15f, 2f)
            verticalLineToRelative(0.5f)
            curveTo(15f, 2.776f, 14.776f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-10f)
            curveTo(4.224f, 3f, 4f, 2.776f, 4f, 2.5f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(3f, 1.724f, 3f, 2f)
            verticalLineToRelative(0.5f)
            close()
        }
    }.build()
}
