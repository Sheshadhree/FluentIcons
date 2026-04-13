package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Check24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Check24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.78f, 5.78f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-7.5f, 7.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(7.5f, -7.5f)
            close()
            moveToRelative(0.167f, 1.248f)
            curveTo(21.982f, 7.197f, 22f, 7.371f, 22f, 7.55f)
            verticalLineToRelative(6.9f)
            curveToRelative(0f, 1.408f, -1.142f, 2.55f, -2.55f, 2.55f)
            horizontalLineTo(4.55f)
            curveTo(3.142f, 17f, 2f, 15.858f, 2f, 14.45f)
            verticalLineToRelative(-6.9f)
            curveTo(2f, 6.142f, 3.142f, 5f, 4.55f, 5f)
            horizontalLineToRelative(14.475f)
            lineToRelative(-1.5f, 1.5f)
            horizontalLineTo(4.55f)
            curveTo(3.97f, 6.5f, 3.5f, 6.97f, 3.5f, 7.55f)
            verticalLineToRelative(6.9f)
            curveToRelative(0f, 0.58f, 0.47f, 1.05f, 1.05f, 1.05f)
            horizontalLineToRelative(14.9f)
            curveToRelative(0.58f, 0f, 1.05f, -0.47f, 1.05f, -1.05f)
            verticalLineTo(8.475f)
            lineToRelative(1.447f, -1.447f)
            close()
            moveTo(4.5f, 9.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(2f)
            curveTo(7.664f, 8.5f, 8f, 8.836f, 8f, 9.25f)
            reflectiveCurveTo(7.664f, 10f, 7.25f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(4.836f, 10f, 4.5f, 9.664f, 4.5f, 9.25f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(4.5f, 12.336f, 4.836f, 12f, 5.25f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
