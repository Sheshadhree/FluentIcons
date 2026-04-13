package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackBelow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackBelow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(8f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(3.75f)
            curveToRelative(-0.199f, 0f, -0.39f, -0.079f, -0.53f, -0.22f)
            curveTo(3.079f, 14.14f, 3f, 13.95f, 3f, 13.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(5f)
            close()
            moveTo(9.5f, 8f)
            horizontalLineToRelative(5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            close()
            moveTo(16f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(21f, 8f)
            horizontalLineToRelative(-5f)
            verticalLineTo(3f)
            horizontalLineToRelative(1.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            close()
            moveTo(8f, 8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(5f)
            close()
            moveTo(3.75f, 19.5f)
            curveTo(3.336f, 19.5f, 3f, 19.836f, 3f, 20.25f)
            reflectiveCurveTo(3.336f, 21f, 3.75f, 21f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
