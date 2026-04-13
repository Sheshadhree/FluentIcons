package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Collections16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Collections16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.854f, 2.121f)
            curveTo(1.52f, 2.478f, 0.728f, 3.85f, 1.086f, 5.183f)
            lineTo(2.12f, 9.047f)
            curveToRelative(0.341f, 1.272f, 1.605f, 2.051f, 2.879f, 1.81f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2.354f)
            lineTo(9.78f, 2.854f)
            curveTo(9.422f, 1.52f, 8.051f, 0.728f, 6.717f, 1.086f)
            lineTo(2.854f, 2.12f)
            close()
            moveTo(6f, 8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            verticalLineTo(10f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 11f, 8.5f, 11f)
            horizontalLineTo(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 10f, 12.5f, 10f)
            horizontalLineTo(11f)
            verticalLineTo(8.5f)
            curveTo(11f, 8.224f, 10.776f, 8f, 10.5f, 8f)
            close()
        }
    }.build()
}
