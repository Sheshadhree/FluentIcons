package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckboxPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckboxPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(2.12f, 1f, 1f, 2.12f, 1f, 3.5f)
            verticalLineToRelative(7f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(4.55f)
            curveToRelative(0.217f, -1.069f, 1.116f, -1.89f, 2.223f, -1.99f)
            curveTo(9.793f, 10.478f, 9.5f, 9.773f, 9.5f, 9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(0.17f, 0f, 0.337f, 0.014f, 0.5f, 0.042f)
            verticalLineTo(3.5f)
            curveTo(13f, 2.12f, 11.88f, 1f, 10.5f, 1f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(6.354f, 4.854f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(6f, 8.293f)
            lineToRelative(3.146f, -3.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            close()
            moveTo(14.5f, 9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(9f, 14.75f, 9f, 13.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
