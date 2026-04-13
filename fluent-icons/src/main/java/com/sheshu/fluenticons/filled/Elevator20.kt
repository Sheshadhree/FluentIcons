package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Elevator20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Elevator20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 3f)
            horizontalLineTo(5f)
            curveTo(3.343f, 3f, 2f, 4.343f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(3f)
            close()
            moveTo(5.646f, 7.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineTo(6.5f, 8.707f)
            verticalLineTo(11.5f)
            curveTo(6.5f, 11.776f, 6.276f, 12f, 6f, 12f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(8.707f)
            lineTo(4.854f, 9.353f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(1.5f, -1.5f)
            close()
            moveTo(10.5f, 16f)
            horizontalLineTo(15f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(13f)
            close()
            moveToRelative(3.854f, -4.146f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(0.646f, 0.646f)
            verticalLineTo(7.5f)
            curveTo(13.5f, 7.224f, 13.724f, 7f, 14f, 7f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2.793f)
            lineToRelative(0.646f, -0.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-1.5f, 1.5f)
            close()
        }
    }.build()
}
