package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpload16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpload16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            reflectiveCurveTo(3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 3f, 13f, 2.776f, 13f, 2.5f)
            reflectiveCurveTo(12.776f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(4.854f, 2.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(7.5f, 5.707f)
            verticalLineTo(13.5f)
            curveTo(7.5f, 13.776f, 7.724f, 14f, 8f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(5.707f)
            lineToRelative(2.646f, 2.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-3.5f, -3.5f)
            close()
        }
    }.build()
}
