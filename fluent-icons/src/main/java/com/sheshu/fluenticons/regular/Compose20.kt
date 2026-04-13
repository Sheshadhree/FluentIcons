package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 4f)
            curveTo(10.776f, 4f, 11f, 4.224f, 11f, 4.5f)
            reflectiveCurveTo(10.776f, 5f, 10.5f, 5f)
            horizontalLineTo(6f)
            curveTo(4.895f, 5f, 4f, 5.896f, 4f, 7f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.104f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.104f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineTo(9.5f)
            curveTo(15f, 9.224f, 15.224f, 9f, 15.5f, 9f)
            reflectiveCurveTo(16f, 9.224f, 16f, 9.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(4.5f)
            close()
            moveToRelative(5.646f, -0.853f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            lineTo(9.06f, 11.645f)
            lineTo(8f, 12f)
            lineToRelative(0.354f, -1.06f)
            lineToRelative(7.793f, -7.793f)
            close()
        }
    }.build()
}
