package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagClock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagClock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 10f)
            horizontalLineToRelative(2.207f)
            curveToRelative(0.62f, -2.192f, 2.566f, -3.828f, 4.917f, -3.987f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, -3.21f)
            curveTo(13.643f, 2.46f, 13.407f, 2f, 13f, 2f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            reflectiveCurveTo(4f, 13.776f, 4f, 13.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(12f, 1.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveTo(11.5f, 9f)
            curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 11f, 13f, 11f)
            horizontalLineToRelative(-1f)
            verticalLineTo(9.5f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            close()
        }
    }.build()
}
