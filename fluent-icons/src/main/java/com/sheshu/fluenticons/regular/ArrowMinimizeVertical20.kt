package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowMinimizeVertical20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMinimizeVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 1f)
            curveTo(9.776f, 1f, 10f, 1.224f, 10f, 1.5f)
            verticalLineToRelative(3.793f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(9f, 5.293f)
            verticalLineTo(1.5f)
            curveTo(9f, 1.224f, 9.224f, 1f, 9.5f, 1f)
            close()
            moveToRelative(-6f, 8.5f)
            curveTo(3.5f, 9.224f, 3.724f, 9f, 4f, 9f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.276f, 10f, 15f, 10f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveToRelative(6.5f, 4.207f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9f, 17.776f, 9f, 17.5f)
            verticalLineToRelative(-3.793f)
            lineToRelative(-1.146f, 1.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(2f, -2f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineTo(10f, 13.707f)
            close()
        }
    }.build()
}
