package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextContinuous20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextContinuous20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 5.224f, 2.224f, 5f, 2.5f, 5f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 5f, 18f, 5.224f, 18f, 5.5f)
            reflectiveCurveTo(17.776f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 6f, 2f, 5.776f, 2f, 5.5f)
            close()
            moveToRelative(0f, 9f)
            curveTo(2f, 14.224f, 2.224f, 14f, 2.5f, 14f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 15f, 2f, 14.776f, 2f, 14.5f)
            close()
            moveToRelative(1.353f, -6.354f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            lineTo(3.793f, 10f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-1.5f, -1.5f)
            close()
            moveTo(7.5f, 8f)
            horizontalLineToRelative(10f)
            curveTo(17.776f, 8f, 18f, 8.224f, 18f, 8.5f)
            reflectiveCurveTo(17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-10f)
            curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
            reflectiveCurveTo(7.224f, 8f, 7.5f, 8f)
            close()
            moveToRelative(0f, 3f)
            curveTo(7.224f, 11f, 7f, 11.224f, 7f, 11.5f)
            reflectiveCurveTo(7.224f, 12f, 7.5f, 12f)
            horizontalLineToRelative(10f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-10f)
            close()
        }
    }.build()
}
