package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Open12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Open12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(3.724f, 3.5f, 3.5f, 3.724f, 3.5f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7.75f)
            curveTo(8.5f, 7.336f, 8.836f, 7f, 9.25f, 7f)
            reflectiveCurveTo(10f, 7.336f, 10f, 7.75f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(0.25f)
            curveTo(4.664f, 2f, 5f, 2.336f, 5f, 2.75f)
            reflectiveCurveTo(4.664f, 3.5f, 4.25f, 3.5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(2.75f, 0f)
            curveTo(6.336f, 3.5f, 6f, 3.164f, 6f, 2.75f)
            reflectiveCurveTo(6.336f, 2f, 6.75f, 2f)
            horizontalLineToRelative(2.5f)
            curveTo(9.664f, 2f, 10f, 2.336f, 10f, 2.75f)
            verticalLineToRelative(2.5f)
            curveTo(10f, 5.664f, 9.664f, 6f, 9.25f, 6f)
            reflectiveCurveTo(8.5f, 5.664f, 8.5f, 5.25f)
            verticalLineTo(4.56f)
            lineTo(7.28f, 5.78f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(7.44f, 3.5f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}
