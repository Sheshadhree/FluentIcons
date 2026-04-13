package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExpandAll20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExpandAll20",
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
            moveToRelative(3.146f, 11.354f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(6f, 14.293f)
            verticalLineTo(7.5f)
            curveTo(6f, 7.224f, 5.776f, 7f, 5.5f, 7f)
            reflectiveCurveTo(5f, 7.224f, 5f, 7.5f)
            verticalLineToRelative(6.793f)
            lineToRelative(-1.647f, -1.647f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.5f, 2.5f)
            close()
            moveTo(17.5f, 8f)
            horizontalLineToRelative(-7f)
            curveTo(10.224f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(10.224f, 7f, 10.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(17.776f, 7f, 18f, 7.224f, 18f, 7.5f)
            reflectiveCurveTo(17.776f, 8f, 17.5f, 8f)
            close()
        }
    }.build()
}
