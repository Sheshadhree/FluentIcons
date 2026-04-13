package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NotebookSubsection24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NotebookSubsection24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveTo(6.515f, 2f, 4.5f, 4.015f, 4.5f, 6.5f)
            verticalLineToRelative(9.4f)
            curveToRelative(0f, 0.98f, 0.626f, 1.813f, 1.5f, 2.122f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(5.002f)
            curveTo(13.693f, 2.626f, 12.86f, 2f, 11.88f, 2f)
            horizontalLineTo(9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 6.75f)
            curveTo(7f, 5.507f, 8.007f, 4.5f, 9.25f, 4.5f)
            horizontalLineTo(15f)
            verticalLineTo(2.75f)
            curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15f, 21.664f, 15f, 21.25f)
            verticalLineTo(20f)
            horizontalLineTo(9.25f)
            curveTo(8.007f, 20f, 7f, 18.993f, 7f, 17.75f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(8f, 11.75f)
            verticalLineTo(6f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 6f, 8.5f, 6.336f, 8.5f, 6.75f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(15f)
            close()
        }
    }.build()
}
